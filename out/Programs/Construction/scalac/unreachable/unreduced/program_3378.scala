package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Boolean,T_B[T_A])) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: T_B[T_A], b: CC_B) extends T_A
case class CC_D(a: T_A) extends T_B[T_B[CC_B]]
case class CC_E(a: Boolean) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_))) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_E(_) => 2 
}
}
// This is not matched: CC_D(CC_C(_, _))