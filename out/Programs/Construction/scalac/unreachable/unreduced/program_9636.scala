package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Byte]], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_C[B](a: B, b: ((Char,CC_B),CC_A), c: CC_B) extends T_A[T_A[T_A[(Boolean,Byte)]]]

val v_a: T_A[T_A[T_A[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}