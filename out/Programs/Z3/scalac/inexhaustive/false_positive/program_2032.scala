package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: Pattern match is empty without constants