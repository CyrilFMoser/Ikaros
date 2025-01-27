package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: T_B, c: CC_A) extends T_A[T_B]
case class CC_C(a: T_A[Char], b: Int, c: Char) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}