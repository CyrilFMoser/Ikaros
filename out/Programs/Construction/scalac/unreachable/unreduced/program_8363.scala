package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, Byte], C], b: (T_A[Boolean, Boolean],T_A[(Char,Int), Byte])) extends T_A[T_A[Boolean, Byte], C]
case class CC_B[D]() extends T_A[T_A[Boolean, Byte], D]

val v_a: T_A[T_A[Boolean, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_)), (_,_)) => 0 
  case CC_A(CC_B(), (_,_)) => 1 
  case CC_B() => 2 
}
}