package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, Boolean],(Byte,Int))) extends T_A[C, Char]
case class CC_B[D](a: D) extends T_A[D, Char]
case class CC_C[E]() extends T_A[E, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,_))) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}