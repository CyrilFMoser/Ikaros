package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C(a: (T_B[CC_A],T_B[T_A])) extends T_B[CC_A]
case class CC_D[B](a: B, b: B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),_)) => 1 
  case CC_C((CC_C(_),_)) => 2 
  case CC_C((CC_D(_, _),_)) => 3 
}
}
// This is not matched: CC_D(_, _)