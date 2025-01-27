package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: (T_A[Int, Char],(Char,(Char,Byte))), c: T_A[E, T_A[E, E]]) extends T_A[E, (Int,T_B[Byte, Int])]
case class CC_B[F]() extends T_A[F, (Int,T_B[Byte, Int])]
case class CC_C(a: T_B[CC_B[Byte], CC_A[Int]], b: CC_A[T_B[Int, Int]], c: CC_A[T_A[Boolean, Byte]]) extends T_A[CC_B[Char], (Int,T_B[Byte, Int])]

val v_a: T_A[CC_B[Char], (Int,T_B[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(0, (_,_), _) => 0 
  case CC_A(_, (_,_), _) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}