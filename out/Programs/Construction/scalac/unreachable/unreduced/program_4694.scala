package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],(Int,Char)), b: (T_A[Int],T_A[Int]), c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B(a: Char) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_A(_, (CC_A(_, _, _),CC_B(_)), _) => 1 
  case CC_A(_, (CC_B(_),CC_A(_, _, _)), _) => 2 
  case CC_A(_, (CC_B(_),CC_B(_)), _) => 3 
  case CC_B(_) => 4 
}
}