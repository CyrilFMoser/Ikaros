package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],Char)) extends T_A[T_B[(Byte,Char)]]
case class CC_B() extends T_A[T_B[(Byte,Char)]]
case class CC_C(a: Char, b: T_A[T_B[(Byte,Int)]]) extends T_A[T_B[(Byte,Char)]]
case class CC_D(a: T_A[T_B[Int]]) extends T_B[Char]
case class CC_E(a: CC_B, b: T_B[Int]) extends T_B[Char]
case class CC_F(a: CC_D) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_) => 2 
}
}