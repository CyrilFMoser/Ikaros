package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Boolean],T_B[Int]), b: T_A[Boolean, T_B[Byte]], c: T_B[T_A[Boolean, Boolean]]) extends T_A[T_A[(Byte,Int), T_B[Boolean]], Byte]
case class CC_B(a: CC_A) extends T_A[T_A[(Byte,Int), T_B[Boolean]], Byte]
case class CC_C() extends T_A[T_A[(Byte,Int), T_B[Boolean]], Byte]
case class CC_D[D](a: T_B[D]) extends T_B[D]

val v_a: T_A[T_A[(Byte,Int), T_B[Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)