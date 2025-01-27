package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_B[T_B[Byte]]) extends T_A[((Boolean,Char),(Boolean,Int))]
case class CC_B(a: Int, b: T_B[T_B[CC_A]], c: T_A[T_A[Byte]]) extends T_A[((Boolean,Char),(Boolean,Int))]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: ((CC_A,CC_B),CC_C[CC_B]), b: Byte, c: D) extends T_B[D]

val v_a: T_A[((Boolean,Char),(Boolean,Int))] = null
val v_b: Int = v_a match{
  case CC_A(0, CC_C()) => 0 
  case CC_A(_, CC_C()) => 1 
  case CC_A(0, CC_D((_,_), _, _)) => 2 
  case CC_A(_, CC_D((_,_), _, _)) => 3 
  case CC_B(_, _, _) => 4 
}
}