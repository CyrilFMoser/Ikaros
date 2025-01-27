package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: T_A[C, C], c: (T_A[Int, Int],T_A[Boolean, Boolean])) extends T_A[D, C]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(CC_A(_, _, _), CC_A(_, _, _), _), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
}
}