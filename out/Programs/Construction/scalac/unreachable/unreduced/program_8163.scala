package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Char]]) extends T_A[Boolean]
case class CC_B(a: CC_A, b: (Int,(Int,CC_A))) extends T_A[Boolean]
case class CC_C(a: T_A[T_A[CC_B]], b: T_A[Boolean], c: Int) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,(_,_))) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)