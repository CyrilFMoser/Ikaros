package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, T_A], b: T_B[T_B[(Boolean,Char), T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, Int]) extends T_A
case class CC_C[C](a: C) extends T_B[Byte, C]
case class CC_D[D](a: CC_A) extends T_B[Byte, D]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}