package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],Byte), b: (Byte,(Int,Int))) extends T_A[T_B[T_A[Int], T_A[Char]]]
case class CC_B(a: (CC_A,Int), b: Boolean, c: (CC_A,CC_A)) extends T_A[T_B[T_A[Int], T_A[Char]]]

val v_a: T_A[T_B[T_A[Int], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), (_,(_,_))) => 0 
  case CC_A((_,_), (_,(_,_))) => 1 
  case CC_B((CC_A(_, _),_), true, (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_B((CC_A(_, _),_), false, (CC_A(_, _),CC_A(_, _))) => 3 
}
}