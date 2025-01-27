package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D](a: ((Char,Int),T_A[Byte, Byte]), b: T_A[D, D]) extends T_A[Byte, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),CC_A()), _) => 1 
  case CC_B(((_,_),CC_B(_, _)), _) => 2 
}
}