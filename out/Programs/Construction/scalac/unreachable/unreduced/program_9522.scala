package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Char], Int], C]
case class CC_B[D](a: (Boolean,CC_A[Char]), b: D) extends T_A[T_A[T_A[Byte, Char], Int], D]
case class CC_C[E](a: ((Byte,Int),T_A[Int, Char]), b: (T_A[Int, Byte],(Int,Char)), c: Byte) extends T_A[T_A[T_A[Byte, Char], Int], E]

val v_a: T_A[T_A[T_A[Byte, Char], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(((_,_),_), (_,(_,_)), 0) => 2 
  case CC_C(((_,_),_), (_,(_,_)), _) => 3 
}
}