package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, (T_A[Byte, (Boolean,Char)],T_A[Boolean, Int])]
case class CC_B[D]() extends T_A[T_A[CC_A[Byte], (Int,Int)], (T_A[Byte, (Boolean,Char)],T_A[Boolean, Int])]

val v_a: T_A[T_A[CC_A[Byte], (Int,Int)], (T_A[Byte, (Boolean,Char)],T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}