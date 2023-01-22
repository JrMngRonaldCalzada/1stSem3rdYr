Public Class Form1
    Private Sub btnFor_Click(sender As Object, e As EventArgs) Handles btnFor.Click
        lstDisplay.Items.Add("Displaying 1-10 to using FOR...NEXT LOOP")

        Dim i As Integer

        For i = 1 To 10
            lstDisplay.Items.Add(i)
        Next
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        lstDisplay.Items.Clear()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        lstDisplay.Items.Add("For...Next Using Step +")

        Dim n As Integer

        For n = 1 To 10 Step 3
            lstDisplay.Items.Add(n)
        Next
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        lstDisplay.Items.Add("For...Next Using Step -")

        Dim x As Integer

        For x = 10 To 1 Step -2
            lstDisplay.Items.Add(x)
        Next
    End Sub

    Private Sub btnDoWhile_Click(sender As Object, e As EventArgs) Handles btnDoWhile.Click
        lstDisplay.Items.Add("Displaying 30-50 using Do..While")

        Dim a As Integer = 30

        Do While a < 41
            lstDisplay.Items.Add(a)
            a += 1
        Loop

        Dim b As Integer = 41
        Do
            lstDisplay.Items.Add(b)
            b += 1
        Loop While b < 51
    End Sub

    Private Sub btnDoUntil_Click(sender As Object, e As EventArgs) Handles btnDoUntil.Click
        Dim n, sum As Integer
        lstDisplay.Items.Add("N" & vbTab & "Sum")

        Do
            n += 1 ' n = n + 1
            sum += n 'sum = sum + n
            lstDisplay.Items.Add(n & vbTab & sum)
        Loop Until n = 100
    End Sub

    Private Sub btnWhile_Click(sender As Object, e As EventArgs) Handles btnWhile.Click
        Dim x As Integer = 100
        lstDisplay.Items.Add("Displaying 100-110 using WHILE LOOP")
        While x < 111
            lstDisplay.Items.Add(x)
            x += 1
        End While
    End Sub
End Class
