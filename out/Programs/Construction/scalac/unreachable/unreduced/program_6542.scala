package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: T_B[C, CC_A], b: T_A, c: T_A) extends T_B[C, CC_A]
case class CC_C[D](a: T_B[D, (T_A,T_A)], b: (CC_B[CC_A],Byte)) extends T_B[D, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_A(_))) => 0 
  case CC_C(_, (CC_B(_, _, _),_)) => 1 
}
}