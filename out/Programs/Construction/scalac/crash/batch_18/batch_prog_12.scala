package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[C](a: (CC_B,Byte), b: C) extends T_B[T_B[C, C], C]

val v_a: T_B[T_B[T_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_A(_))) => 0 
  case CC_C(_, CC_A(CC_B(_))) => 1 
  case CC_C(_, CC_B(_)) => 2 
}
}