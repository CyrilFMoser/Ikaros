package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[((Int,Boolean),Byte), ((Int,Boolean),Byte)], ((Int,Boolean),Byte)], b: (CC_A[Int],T_A[Boolean, Boolean])) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_A(),_)) => 1 
}
}
// This is not matched: CC_B(CC_B(_, (_,_)), (CC_A(),_))