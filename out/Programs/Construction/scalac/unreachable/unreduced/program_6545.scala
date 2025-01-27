package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[T_A, T_A]], c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C](a: T_A, b: C, c: T_A) extends T_B[C, Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), _, _) => 0 
  case CC_D(CC_B(CC_A(_, _, _)), _, _) => 1 
  case CC_D(CC_B(CC_B(_)), _, _) => 2 
  case CC_D(CC_B(CC_C(_)), _, _) => 3 
  case CC_D(CC_C(_), _, _) => 4 
}
}