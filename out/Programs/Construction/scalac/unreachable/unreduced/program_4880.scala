package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: (T_A[Byte],T_A[Int]), b: CC_A[D], c: T_B[D]) extends T_A[D]
case class CC_C(a: CC_B[Int], b: Int) extends T_B[T_A[Boolean]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A()), _, _) => 1 
  case CC_B((CC_A(),CC_B(_, _, _)), _, _) => 2 
  case CC_B((CC_B(_, _, _),CC_A()), _, _) => 3 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 4 
}
}