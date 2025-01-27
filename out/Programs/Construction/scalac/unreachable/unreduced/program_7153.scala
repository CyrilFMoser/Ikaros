package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: CC_A) extends T_A
case class CC_D(a: CC_A) extends T_B[T_A]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), (_,_))) => 0 
  case CC_D(CC_A(CC_B(_), (_,_))) => 1 
  case CC_D(CC_A(CC_C(_, _, _), (_,_))) => 2 
}
}