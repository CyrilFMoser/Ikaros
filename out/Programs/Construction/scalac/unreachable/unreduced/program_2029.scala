package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Byte, C], b: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B(a: CC_A[CC_A[T_B]], b: (T_A[T_B, T_B],T_A[Byte, T_B]), c: T_B) extends T_A[Byte, CC_A[T_A[(Boolean,Byte), T_B]]]

val v_a: T_A[Byte, CC_A[T_A[(Boolean,Byte), T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _) => 3 
  case CC_A(CC_B(_, _, _), _) => 4 
  case CC_B(CC_A(CC_A(_, _), CC_A(_, _)), (_,CC_A(_, _)), _) => 5 
}
}