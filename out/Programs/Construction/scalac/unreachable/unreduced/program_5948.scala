package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D](a: D, b: (Int,T_A[Byte, Byte])) extends T_A[D, Int]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}