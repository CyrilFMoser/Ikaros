package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Boolean],T_A[Byte, Char])) extends T_A[T_B[T_A[(Int,Boolean), Boolean]], Byte]
case class CC_B() extends T_B[Byte]
case class CC_C(a: CC_A) extends T_B[Byte]
case class CC_D(a: CC_A, b: T_B[Byte], c: T_B[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A((_,_))) => 1 
  case CC_D(_, _, _) => 2 
}
}