package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: Int, c: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: Char) extends T_A[Char]
case class CC_C(a: (Byte,Byte), b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[Char]
case class CC_D(a: CC_C, b: (Int,Byte)) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C((_,_), _, _), (_,_)) => 0 
  case CC_E(_) => 1 
}
}