package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((Int,T_A),T_B[T_A, Int]), b: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[Boolean, CC_A]) extends T_B[CC_B, (T_A,T_A)]
case class CC_E() extends T_B[CC_B, (T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}