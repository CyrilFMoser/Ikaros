package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_B[D]]
case class CC_B(a: Int) extends T_B[T_B[CC_A[Char, (Byte,Int)]]]
case class CC_C(a: (T_B[Boolean],(Char,CC_B))) extends T_B[T_B[CC_A[Char, (Byte,Int)]]]

val v_a: T_B[T_B[CC_A[Char, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((_,(_,_))) => 1 
}
}