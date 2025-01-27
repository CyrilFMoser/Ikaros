package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: (T_A[Int],Char)) extends T_A[Byte]
case class CC_B(a: T_A[T_B[CC_A]], b: T_A[Byte], c: T_B[CC_A]) extends T_A[Byte]
case class CC_C(a: T_A[Byte]) extends T_A[Byte]
case class CC_D(a: T_A[T_B[CC_B]], b: Char) extends T_B[CC_B]
case class CC_E(a: T_B[T_A[CC_C]]) extends T_B[CC_B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(CC_A(_, _)) => 3 
  case CC_C(CC_B(_, _, _)) => 4 
  case CC_C(CC_C(_)) => 5 
}
}