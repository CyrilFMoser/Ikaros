package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: Char) extends T_A[D]
case class CC_B(a: T_A[Byte], b: T_A[CC_A[Int]]) extends T_A[(CC_A[Int],Boolean)]
case class CC_C(a: (CC_A[CC_B],(Boolean,(Int,Char))), b: CC_B, c: T_B[CC_A[CC_B], CC_A[Int]]) extends T_A[(CC_A[Int],Boolean)]
case class CC_D(a: T_B[CC_C, CC_B], b: CC_A[T_B[CC_C, CC_B]], c: CC_C) extends T_B[CC_C, CC_B]

val v_a: T_A[(CC_A[Int],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(CC_A(_, _, _), _), _) => 1 
  case CC_A(_, CC_C((_,_), CC_B(_, _), _), _) => 2 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), 'x'), CC_A(_, _, _)) => 3 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _)) => 4 
  case CC_C(_, CC_B(CC_A(_, _, _), _), _) => 5 
}
}