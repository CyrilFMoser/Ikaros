package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int]), b: T_A[Byte]) extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[Int], c: Byte) extends T_A[Int]
case class CC_C(a: (T_A[CC_A],CC_B), b: (T_A[CC_A],(CC_B,(Boolean,Boolean)))) extends T_A[T_A[T_A[CC_A]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_B(_, _, _)), _) => 1 
  case CC_A((CC_B(_, _, _),CC_A(_, _)), _) => 2 
  case CC_A((CC_B(_, _, _),CC_B(_, _, _)), _) => 3 
  case CC_B(_, CC_A((_,_), _), _) => 4 
  case CC_B(_, CC_B(CC_A(_, _), CC_A(_, _), _), _) => 5 
  case CC_B(_, CC_B(CC_B(_, _, _), CC_A(_, _), _), _) => 6 
  case CC_B(_, CC_B(CC_A(_, _), CC_B(_, _, _), _), _) => 7 
  case CC_B(_, CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _) => 8 
}
}