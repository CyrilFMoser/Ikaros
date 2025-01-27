package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Byte, c: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: CC_A) extends T_A[Char]
case class CC_C(a: T_A[((Boolean,Boolean),(Int,Boolean))], b: ((CC_B,Char),CC_A)) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}