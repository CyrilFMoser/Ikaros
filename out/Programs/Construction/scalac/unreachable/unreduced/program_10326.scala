package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: (T_B[Int, Int],T_A[Boolean, (Boolean,Boolean)])) extends T_A[E, Boolean]
case class CC_B[F, G]() extends T_A[F, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}