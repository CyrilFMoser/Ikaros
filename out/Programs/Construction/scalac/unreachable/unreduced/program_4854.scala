package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: (T_A,Boolean)) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[T_A, T_B[CC_A, T_A]]) extends T_A
case class CC_D[C, D](a: CC_A) extends T_B[(T_B[T_A, Boolean],CC_B), C]
case class CC_E(a: Int, b: T_B[T_A, (CC_B,(Int,Int))], c: CC_D[CC_D[(Boolean,Int), CC_B], (Byte,CC_B)]) extends T_B[(T_B[T_A, Boolean],CC_B), T_B[Char, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, _, (CC_B(_),_)) => 1 
  case CC_A(_, _, (CC_C(_),_)) => 2 
  case CC_B(CC_A(_, CC_A(_, _, _), (_,_))) => 3 
  case CC_B(CC_A(_, CC_B(_), (_,_))) => 4 
  case CC_B(CC_A(_, CC_C(_), (_,_))) => 5 
  case CC_B(CC_B(CC_A(_, _, _))) => 6 
  case CC_B(CC_B(CC_B(_))) => 7 
  case CC_B(CC_B(CC_C(_))) => 8 
  case CC_B(CC_C(_)) => 9 
  case CC_C(_) => 10 
}
}