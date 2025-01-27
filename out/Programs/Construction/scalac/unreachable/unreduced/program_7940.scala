package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[T_A[D, (Byte,Boolean)], D], c: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B() extends T_A[T_B[(Boolean,Char)], T_A[T_B[(Boolean,Char)], T_B[(Boolean,Char)]]]
case class CC_C[E, F]() extends T_A[E, F]
case class CC_D(a: CC_A[CC_C[CC_B, Int]], b: T_A[T_A[Char, CC_B], T_B[CC_B]]) extends T_B[(T_A[(Int,Char), (Byte,Boolean)],T_A[CC_B, Boolean])]

val v_a: T_A[T_B[(Boolean,Char)], T_A[T_B[(Boolean,Char)], T_B[(Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_B() => 3 
  case CC_C() => 4 
}
}