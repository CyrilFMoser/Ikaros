package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[B]
case class CC_B[C](a: (Int,Byte)) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((12,_)) => 1 
  case CC_B((_,_)) => 2 
  case CC_C() => 3 
}
}