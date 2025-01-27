package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: (Boolean,T_A[Byte])) extends T_A[T_A[T_A[Char]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: CC_A) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, (_,_))) => 1 
}
}