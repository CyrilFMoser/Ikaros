package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[Char, T_A[T_A[Boolean, Boolean], T_A[Int, (Int,Char)]]]
case class CC_B(a: T_A[T_A[(Boolean,Byte), Char], CC_A], b: CC_A, c: T_A[T_A[Boolean, CC_A], CC_A]) extends T_A[Char, T_A[T_A[Boolean, Boolean], T_A[Int, (Int,Char)]]]

val v_a: T_A[Char, T_A[T_A[Boolean, Boolean], T_A[Int, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}