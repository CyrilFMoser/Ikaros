package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],T_B[Int]), b: Int) extends T_A[T_B[Boolean]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_B[T_B[(Byte,Char)]]) extends T_B[Byte]
case class CC_C[C](a: Byte) extends T_B[Byte]
case class CC_D(a: (T_B[Boolean],T_B[CC_A])) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D((_,_)) => 1 
}
}
// This is not matched: CC_B(_, _)