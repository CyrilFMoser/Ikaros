package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[Boolean, CC_A[(Char,Boolean)]], D]
case class CC_C[E](a: T_A[T_A[E, E], E], b: (CC_B[Byte],T_A[(Boolean,Boolean), Boolean])) extends T_A[E, CC_A[CC_A[Boolean]]]

val v_a: T_A[T_A[Boolean, CC_A[(Char,Boolean)]], CC_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C(_, (_,_)) => 1 
}
}