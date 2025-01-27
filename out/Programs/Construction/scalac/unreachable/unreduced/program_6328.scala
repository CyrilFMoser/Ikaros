package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[(Char,Boolean)], c: T_B[T_B[Int]]) extends T_A[T_A[T_B[(Byte,Byte)]]]
case class CC_B(a: T_A[T_B[Boolean]]) extends T_A[T_A[T_B[(Byte,Byte)]]]
case class CC_C() extends T_A[T_A[T_B[(Byte,Byte)]]]
case class CC_D(a: CC_B, b: Byte, c: CC_B) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_A[T_A[T_B[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)