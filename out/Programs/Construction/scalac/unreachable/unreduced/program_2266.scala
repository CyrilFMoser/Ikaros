package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], T_A[Char, Char]]) extends T_A[Int, T_A[T_A[Int, Boolean], T_A[(Boolean,Byte), Boolean]]]
case class CC_B() extends T_A[Int, T_A[T_A[Int, Boolean], T_A[(Boolean,Byte), Boolean]]]

val v_a: T_A[Int, T_A[T_A[Int, Boolean], T_A[(Boolean,Byte), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}