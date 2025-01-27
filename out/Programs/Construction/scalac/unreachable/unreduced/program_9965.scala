package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[Boolean, T_A[T_A[(Boolean,Char), Char], (Boolean,(Boolean,Byte))]]
case class CC_B(a: T_A[CC_A, T_B[CC_A]]) extends T_B[CC_A]
case class CC_C[D]() extends T_B[D]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}