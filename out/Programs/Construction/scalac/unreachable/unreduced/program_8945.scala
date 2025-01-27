package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: CC_A, c: CC_A) extends T_A
case class CC_C(a: T_B[(CC_A,T_A)]) extends T_B[(CC_A,T_A)]
case class CC_D() extends T_B[(CC_A,T_A)]
case class CC_E(a: CC_B, b: T_A) extends T_B[(CC_A,T_A)]

val v_a: T_B[(CC_A,T_A)] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, CC_A((_,_))) => 1 
  case CC_E(_, CC_B(_, CC_A(_), _)) => 2 
}
}
// This is not matched: CC_D()