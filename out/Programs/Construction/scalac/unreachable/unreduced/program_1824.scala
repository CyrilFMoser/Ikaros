package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Int], c: (Boolean,T_A[Char])) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}