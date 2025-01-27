package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],T_A[Boolean, Int]), b: Boolean) extends T_A[Int, C]
case class CC_B[D]() extends T_A[Int, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), _) => 0 
  case CC_A((CC_B(),_), _) => 1 
  case CC_B() => 2 
}
}