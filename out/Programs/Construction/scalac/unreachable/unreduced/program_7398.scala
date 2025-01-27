package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: (T_A,(T_A,T_A))) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[CC_A], b: CC_B) extends T_B[Boolean]
case class CC_D(a: T_B[CC_B], b: CC_B) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}