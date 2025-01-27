package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Int, Boolean], T_A[Char, T_A[(Char,Char), Byte]]]
case class CC_B[C]() extends T_A[CC_A, C]
case class CC_C[D](a: T_A[D, D], b: (T_A[CC_A, CC_A],T_A[CC_A, CC_A]), c: T_A[D, D]) extends T_A[CC_A, D]

val v_a: T_A[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (CC_B(),CC_B()), _) => 1 
  case CC_C(_, (CC_B(),CC_C(_, _, _)), _) => 2 
  case CC_C(_, (CC_C(_, _, _),CC_B()), _) => 3 
  case CC_C(_, (CC_C(_, _, _),CC_C(_, _, _)), _) => 4 
}
}