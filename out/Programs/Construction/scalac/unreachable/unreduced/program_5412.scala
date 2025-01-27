package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[Char, D]
case class CC_B(a: Boolean, b: T_A[Char, T_A[Char, Boolean]], c: Char) extends T_A[Char, T_B[T_A[Char, Char]]]
case class CC_C[E](a: (T_B[CC_B],T_A[CC_B, CC_B]), b: T_B[E], c: (T_B[CC_B],Int)) extends T_B[E]
case class CC_D(a: Int) extends T_B[(T_A[Char, Char],T_B[Boolean])]

val v_a: T_B[(T_A[Char, Char],T_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_, _, _),_), CC_C((_,_), _, _), _) => 0 
  case CC_C((CC_C(_, _, _),_), CC_D(_), _) => 1 
  case CC_D(_) => 2 
}
}