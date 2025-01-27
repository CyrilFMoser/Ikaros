package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_A[T_A[Boolean]]], b: T_A[D]) extends T_A[D]
case class CC_B(a: T_B[T_B[Int, Char], T_B[Boolean, (Byte,Int)]]) extends T_B[Int, T_B[CC_A[Boolean], T_B[Char, Char]]]
case class CC_C(a: CC_B, b: CC_B, c: Byte) extends T_B[Int, T_B[CC_A[Boolean], T_B[Char, Char]]]
case class CC_D(a: CC_B) extends T_B[Int, T_B[CC_A[Boolean], T_B[Char, Char]]]

val v_a: T_B[Int, T_B[CC_A[Boolean], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_B(_), _) => 1 
  case CC_D(_) => 2 
}
}