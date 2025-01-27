package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B() extends T_B[((T_A,T_A),Boolean)]
case class CC_C(a: CC_A) extends T_B[((T_A,T_A),Boolean)]
case class CC_D[B]() extends T_B[((T_A,T_A),Boolean)]

val v_a: T_B[((T_A,T_A),Boolean)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _))) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B()